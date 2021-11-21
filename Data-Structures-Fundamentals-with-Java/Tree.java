import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tree {
    static class Directory {
        String name;
        List<Directory> subdirectories;
        Directory parent;

        public Directory(String name, List<Directory> subdirectories) {
            this.name = name;
            this.subdirectories = subdirectories != null ? subdirectories : new ArrayList<>();
            for (Directory subdirectory : this.subdirectories) {
                subdirectory.parent = this;
            }
        }

        public String getName() {
            return name;
        }

        public List<Directory> getSubdirectories() {
            return subdirectories;
        }

        public Directory getParent() {
            return parent;
        }
    }

    public static void main(String[] args) {
        Directory root = new Directory("C", Arrays.asList(
                new Directory("boot", null),
                new Directory("ESD", null),
                new Directory("Intel", null),
                new Directory("Microsoft", null),
                new Directory("MinGW", Arrays.asList(
                        new Directory("bin", null),
                        new Directory("include", null),
                        new Directory("lib", null),
                        new Directory("libexec", null)
                )),
                new Directory("Program Files", null)
        ));

        printDirectory(root, 0);
    }

    private static void printDirectory(Directory directory, int indentationLevel) {
        for (int i = 0; i < indentationLevel; i++) {
            System.out.print("--");
        }
        System.out.println(directory.name);

        for (Directory subdirectory : directory.getSubdirectories()) {
            printDirectory(subdirectory, indentationLevel + 1);
        }
    }
}
