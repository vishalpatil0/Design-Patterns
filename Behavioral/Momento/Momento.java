import java.util.ArrayList;
import java.util.List;

class TextArea {
    private String text = "";

    public Momento getMomentoState() {
        return new Momento(text);
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText()
    {
        return text;
    }    
    static class Momento {
        String data;

        Momento(String data) {
            this.data = data;
        }

        public String getText() {
            return data;
        }
    }
}

class Editor {
    TextArea textArea;
    int index = -1;
    List<TextArea.Momento> momentoList;
    Editor() {
        textArea = new TextArea();
        momentoList = new ArrayList<TextArea.Momento>();
    }
    public void write(String text) {
        textArea.setText(text);
        momentoList.add(textArea.getMomentoState());
        index++;
    }

    public void undo() {
        textArea.setText(momentoList.get(index--).getText());
    }

    public void print() {
        System.out.println(textArea.getText());
    }
}
public class Momento {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.write("1 ");
        editor.write("2 ");
        editor.write("3 ");
        editor.write("4 ");
        
        editor.print();

        editor.undo();
        editor.undo();

        editor.print();
    }
}
