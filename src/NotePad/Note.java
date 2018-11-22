package NotePad;

import java.util.Date;

public class Note {

    private String name;
    private String text;
    private String date;
    private String place;
    private String contact;
    private Type type;

    static NoteBuilder builder(){return new NoteBuilder();}

    static class NoteBuilder{

        Note note = new Note();

        public NoteBuilder name(String name){
            note.name = name;
            return this;
        }
        public NoteBuilder text(String text){
            note.text = text;
            return this;
        }
        public NoteBuilder date(String date){
            note.date = date;
            return this;
        }
        public NoteBuilder place(String place){
            note.place = place;
            return this;
        }
        public NoteBuilder contact(String contact){
            note.contact = contact;
            return this;
        }
        public NoteBuilder type(Type type){
            note.type = type;
            return this;
        }

        public Note build() {
            return note;
        }
    }

    @Override
    public String toString() {
        return "Note{" +
                "name='" + name + '\'' +
                ", text='" + text + '\'' +
                ", date='" + date + '\'' +
                ", place='" + place + '\'' +
                ", contact='" + contact + '\'' +
                ", type=" + type +
                '}';
    }
}
