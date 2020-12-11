/**
 * 用户文件目录类
 * @author BlankSpace
 */
class UFD {

    String file_name;

    int[] protect = new int[3];

    int file_length;

    UFD(){
        file_name = null;
        protect[0] = 1;
        protect[1] = 1;
        protect[2] = 1;
        file_length = 0;
    }

    UFD(String name, int file_length){
        this.file_name =name;
        this.file_length  =file_length;
        protect[0] = 1;
        protect[1] = 1;
        protect[2] = 1;
    }

}
