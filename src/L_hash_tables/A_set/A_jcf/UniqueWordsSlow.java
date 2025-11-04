// Running time is O(n^2), where n is the number of words in the file.
void main() throws FileNotFoundException {
    String filename = IO.readln("filename? ");
    Scanner fileScanner = new Scanner(new File(filename));
    List<String> uniqueWords = new ArrayList<>();

    while (fileScanner.hasNext()) {
        String word = fileScanner.next();

        if (!uniqueWords.contains(word)) {
            uniqueWords.add(word);
        }
    }

    IO.println("Number of unique words: " + uniqueWords.size());
}