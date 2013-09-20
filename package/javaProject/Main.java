import network.WebManager;
import image.ImageManager;
class Main{
	public static void main(String arvg[]){
		WebManager web = new WebManager();
		System.out.println(web.getRemoteResource("URL Test"));
		ImageManager image = new ImageManager();
		image.getRemoteImage();
		
	}
}
