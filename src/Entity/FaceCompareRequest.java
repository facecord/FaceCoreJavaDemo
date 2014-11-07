package Entity;

public class FaceCompareRequest {
	private String faceFeature1;
	private String faceFeature2;
	
	public void setFaceFeature1(String feature){
		faceFeature1=feature;
	}
	
	public String getFaceFeature1(){
		return faceFeature1;
	}
	
	public void setFaceFeature2(String feature){
		faceFeature2=feature;
	}
	
	public String getFaceFeature2()
	{
		return faceFeature2;
	}
}
