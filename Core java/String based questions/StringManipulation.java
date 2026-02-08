
public class StringManipulation {
	public static void main(String[] args) {
		String original_filename = "resume.pdf";
		String timestamp = "20260129";
        StringBuilder fileName = new StringBuilder(original_filename);
        fileName.insert(0, timestamp + "_");
        System.out.println("New File Name = " + fileName);
	}

}
