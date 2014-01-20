package Entity;

public class FaceModel {
	private int FaceRectangleX;
	private int FaceRectangleY;
	private int FaceRectangleWidth;
	private int FaceRectangleHeight;
	private String Base64Feature;
	
	public void setFaceRectangleX(int faceRectangleX){
		FaceRectangleX=faceRectangleX;
	}
	
	public int getFaceRectangleX()
	{
		return FaceRectangleX;
	}
	
	public void setFaceRectangleY(int faceRectangleY){
		FaceRectangleY=faceRectangleY;
	}
	
	public int getFaceRectangleY(){
		return FaceRectangleY;
	}
	
	public void setFaceRectangleWidth(int faceRectangleWidth){
		FaceRectangleWidth=faceRectangleWidth;
	}
	
	public int getFaceRectangleWidth()
	{
		return FaceRectangleWidth;
	}
	
	public void setFaceRectangleHeight(int faceRectangleHeight){
		FaceRectangleHeight=faceRectangleHeight;
	}
	
	public int getFaceRectangleHeight(){
		return FaceRectangleHeight;
	}
	
	public String getFeature(){
		return Base64Feature;
	}
	
	public void setFeature(String feature){
		Base64Feature=feature;
	}
	
}
