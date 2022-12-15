package model;

public class Gold extends Theme {

	@Override
	public void useTheme() {
		// TODO Auto-generated method stub
		this.bg="warna emas (#FFD700)";
		this.border="solid, emas gelap";
		this.icon="gambar koin emas";
		this.music="musik klasik";
		
		System.out.println("Background -> "+bg);
		System.out.println("Border -> "+border);
		System.out.println("Icon -> "+icon);
		System.out.println("Music -> "+music);
	}

}
