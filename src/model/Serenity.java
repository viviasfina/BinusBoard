package model;

public class Serenity extends Theme {

	@Override
	public void useTheme() {
		// TODO Auto-generated method stub
		this.bg="warna putih perak(#EFEFEF)";
		this.border="solid, warna putih salju dengan bayangan hitam";
		this.icon="gambar rubah putih";
		this.music="musik yang tenang";
		
		System.out.println("Background -> "+bg);
		System.out.println("Border -> "+border);
		System.out.println("Icon -> "+icon);
		System.out.println("Music -> "+music);
	}

	
}
