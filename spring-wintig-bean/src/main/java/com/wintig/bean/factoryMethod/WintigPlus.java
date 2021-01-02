package com.wintig.bean.factoryMethod;

public class WintigPlus {

	private String name = "wintig";

	public static WintigPlus getWintigPlusBean() {
		return new WintigPlus("wintig plus");
	}

	public WintigPlus(String name) {
		this.name = name;
	}
}
