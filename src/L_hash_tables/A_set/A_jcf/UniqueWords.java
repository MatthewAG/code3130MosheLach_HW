// Running time is O(n), where n is the number of words in the file.
void main() throws FileNotFoundException {
    String filename = IO.readln("filename? ");
    Scanner fileScanner = new Scanner(new File(filename));
    Set<String> uniqueWords = new HashSet<>();

    while (fileScanner.hasNext()) {
        String word = fileScanner.next();
        uniqueWords.add(word);
    }

    IO.println("Number of unique words: " + uniqueWords.size());
}