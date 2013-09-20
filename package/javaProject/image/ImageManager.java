package image;
import network.WebManager;

public class ImageManager{

	WebManager webManager = new WebManager();
	public void getRemoteImage(){
		String remoteImage = webManager.getRemoteResource("flower.png"); 
		System.out.println("got image "+ remoteImage);
	}
}
