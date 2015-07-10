import com.github.koraktor.steamcondenser.exceptions.SteamCondenserException;
import com.github.koraktor.steamcondenser.steam.servers.GoldSrcServer;
import java.util.concurrent.TimeoutException;

public class talkRcon {
	public void getPlayerList() {
		
	}
	public void main(String[] args) {
		GoldSrcServer server = null;
		try {
			server = new GoldSrcServer("hede.nifelheim.ws", 32330);
		} catch (SteamCondenserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			server.initialize();
		} catch (SteamCondenserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TimeoutException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			System.out.println(server.getPlayers());
		} catch (SteamCondenserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TimeoutException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
