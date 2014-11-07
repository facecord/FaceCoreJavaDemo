package Entity;

public class FaceCompareRequest {
	private String facefeature1;
	private String facefeature2;
	
	public void setFaceFeature1(String feature){
		facefeature1=feature;
	}
	
	public String getFaceFeature1(){
		return facefeature1;
	}
	
	public void setFaceFeature2(String feature){
		facefeature2=feature;
	}
	
	public String getFaceFeature2()
	{
		return facefeature2;
	}
}
