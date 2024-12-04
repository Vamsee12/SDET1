package diffWaysToCreatePostReqInRestAssured;

public class POJO_PostRequest {
	
	String name;
	String location;
	String title;
	String formats[];
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String[] getFormats() {
		return formats;
	}
	public void setFormats(String[] formats) {
		this.formats = formats;
	}
	
}
