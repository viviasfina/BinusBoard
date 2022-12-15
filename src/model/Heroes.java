package model;

public class Heroes extends Theme {
	@Override
	public void useTheme() {
		// TODO Auto-generated method stub
		this.bg="warna biru metalik (#376282)";
		this.border="solid, warna abu-abu gelap metalik";
		this.icon="gambar superhero";
		this.music="musik orkestra yang tegang dan bersemangat";
		
		System.out.println("Background -> "+bg);
		System.out.println("Border -> "+border);
		System.out.println("Icon -> "+icon);
		System.out.println("Music -> "+music);
		
	}

}
