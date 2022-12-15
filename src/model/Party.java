package model;

public class Party extends Theme {

	@Override
	public void useTheme() {
		// TODO Auto-generated method stub
		this.bg="warna pink menyala (#F9A7B0)";
		this.border="putus-putus, warna merah maroon";
		this.icon="gambar orang berdansa";
		this.music="musik yang semangat dan menarik";
		
		System.out.println("Background -> "+bg);
		System.out.println("Border -> "+border);
		System.out.println("Icon -> "+icon);
		System.out.println("Music -> "+music);
	}

}
