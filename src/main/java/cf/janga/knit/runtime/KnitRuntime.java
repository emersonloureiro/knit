package cf.janga.knit.runtime;

public class KnitRuntime {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: knit /path/to/knit/file.knit");
        }
        new KnitProgramRunner().run(args[0]);
    }
}
