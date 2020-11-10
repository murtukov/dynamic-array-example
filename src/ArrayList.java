public class ArrayList {
    private String[] content;
    private int counter = 0;

    ArrayList() {
        this.content = new String[3];
    }

    public ArrayList push(String value) {
        if (this.counter == this.content.length) {
            // Change array length
            String[] tmp = this.content;
            this.content = new String[this.content.length * 2];

            for (int i = 0; i < tmp.length; i++) {
                this.content[i] = tmp[i];
            }
        }

        this.content[this.counter] = value;
        counter++;

        return this;
    }

    public String get(int index) {
        return this.content[index];
    }

    public void reset() {
        this.content = new String[3];
    }

    public int getLength() {
        return this.content.length;
    }

    public String toString() {
        String output = "";

        int i = 1;
        for (String name : this.content) {
            if (name == null) {
                break;
            }

            output += i++ + ". " + name + "\n";
        }

        return output;
    }
}
