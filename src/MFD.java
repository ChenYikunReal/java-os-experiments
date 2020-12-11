import java.util.LinkedList;

/**
 * 主文件目录
 * @author BlankSpace
 */
class MFD {

    String user_name;

    LinkedList<UFD> link;

    MFD(){
        user_name = null;
        link = null;
    }

    MFD(String user_name){
        this.user_name = user_name;
        this.link = null;
    }

}
