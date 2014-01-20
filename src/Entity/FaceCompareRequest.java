package Entity;

public class FaceCompareRequest {
	private String FaceFeature1;
	private String FaceFeature2;
	
	public void setFaceFeature1(String feature){
		FaceFeature1=feature;
	}
	
	public String getFaceFeature1(){
		return FaceFeature1;
	}
	
	public void setFaceFeature2(String feature){
		FaceFeature2=feature;
	}
	
	public String getFaceFeature2()
	{
		return FaceFeature2;
	}
}
