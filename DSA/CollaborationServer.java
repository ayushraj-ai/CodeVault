import java.io.*; 
import java.net.*;
 import java.util.*;

public class CollaborationServer { private static final int PORT = 5002;
private static final ArrayList<ClientHandler> clients = new ArrayList<>();

public static void main(String[] args) { System.out.println("Collaboration Server started on port " + PORT);

try (ServerSocket serverSocket = new ServerSocket(PORT)) { while (true) {
Socket clientSocket = serverSocket.accept(); System.out.println("New client connected: " +
clientSocket.getRemoteSocketAddress());

ClientHandler client = new ClientHandler(clientSocket); synchronized (clients) {
clients.add(client);
}

new Thread(client).start();
}
} catch (IOException e) { e.printStackTrace();
}
}

// Broadcast message to all connected clients
public static void broadcast(String message, ClientHandler sender) {
synchronized (clients) { Iterator<ClientHandler> it = clients.iterator(); while (it.hasNext()) {
ClientHandler client = it.next();
if (!client.sendMessage(message)) { it.remove(); // Remove disconnected clients
}
}
}
}

// ===================== CLIENT HANDLER=====================
static class ClientHandler implements Runnable { private Socket socket;
private BufferedReader in; private PrintWriter out;

public ClientHandler(Socket socket) { this.socket = socket;
try {
in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
out = new PrintWriter(socket.getOutputStream(), true);
} catch (IOException e) { closeEverything();
}
}

@Override
public void run() { try {
String msg;
while ((msg = in.readLine()) != null) { System.out.println("Received: " + msg);
// Broadcast to all clients broadcast(msg, this);
 
}
} catch (IOException e) { System.out.println("Client disconnected: " +
socket.getRemoteSocketAddress());
} finally { closeEverything();
}
}

// Send message to this client
public boolean sendMessage(String message) { if (out != null) {
out.println(message); return true;
}
return false;
}

private void closeEverything() {
try { if (in != null) in.close(); } catch (IOException ignored) {} if (out != null) out.close();
try { if (socket != null) socket.close(); } catch (IOException ignored) {} synchronized (clients) {
clients.remove(this);
}
}
}
}
