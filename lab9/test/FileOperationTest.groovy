package lab9



class FileOperationTest extends GroovyTestCase {
    void testCopyFile() {
        File file =new File(System.getProperty("user.dir"),"text.txt");
        FileOperation fileOperation=new FileOperation();
        fileOperation.copyFile(file);
        File pathFile=new File(file.getParent()+"/New/",file.getName());
        assertEquals(true,pathFile.exists())
    }
}
