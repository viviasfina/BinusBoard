package model;

public class VIP extends Theme{


	@Override
	public void useTheme() {
		// TODO Auto-generated method stub
		this.bg="warna platinum (#E5E4E2)";
		this.border="solid, warna putih bersih";
		this.icon="gambar mahkota";
		this.music="musik klasik";

		System.out.println("Background -> "+bg);
		System.out.println("Border -> "+border);
		System.out.println("Icon -> "+icon);
		System.out.println("Music -> "+music);
	}
}
