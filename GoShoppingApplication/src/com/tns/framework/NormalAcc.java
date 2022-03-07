package com.tns.framework;

public class NormalAcc extends ShopAcc
{

	private float deliveryCharge=50;
	
	 public float getDeliveryCharge() {
			return deliveryCharge;
	 }
	public NormalAcc(int accNo, String accNm, float charges, float deliveryCharge) {
		super(accNo, accNm, charges);
		this.deliveryCharge = deliveryCharge;
	}
	public void bookProduct(float deliveryCharge)
	{
	   System.out.println("charges are:"+deliveryCharge);	
	}
	
	@Override
	public String toString() {
	return "NormalAcc [deliveryCharge=" + deliveryCharge + ", accNo=" + getAccNo() + ", accNm=" + getAccNm() + ", charges="
				+ getCharges() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
}