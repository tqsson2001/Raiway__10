package com.vti.testingsytem.entity;

public class HinhVuong extends HinhChuNhat {
	
	@Override
	public float Tinhchuvi(float a, float b) {
		return ( a * 4);
	}

	@Override
	public float Tinhdientich(float c, float d) {
		return super.Tinhdientich(c, d);
	}
}
