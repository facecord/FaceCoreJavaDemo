package Entity;

public class FaceModel {
	private int facerectanglex;
	private int facerectangley;
	private int facerectanglewidth;
	private int facerectangleheight;
	private String base64feature;
	
	public void setFaceRectangleX(int faceRectangleX){
		facerectanglex=faceRectangleX;
	}
	
	public int getFaceRectangleX()
	{
		return facerectanglex;
	}
	
	public void setFaceRectangleY(int faceRectangleY){
		facerectangley=faceRectangleY;
	}
	
	public int getFaceRectangleY(){
		return facerectangley;
	}
	
	public void setFaceRectangleWidth(int faceRectangleWidth){
		facerectanglewidth=faceRectangleWidth;
	}
	
	public int getFaceRectangleWidth()
	{
		return facerectanglewidth;
	}
	
	public void setFaceRectangleHeight(int faceRectangleHeight){
		facerectangleheight=faceRectangleHeight;
	}
	
	public int getFaceRectangleHeight(){
		return facerectangleheight;
	}
	
	public String getFeature(){
		return base64feature;
	}
	
	public void setFeature(String feature){
		base64feature=feature;
	}
	
}
