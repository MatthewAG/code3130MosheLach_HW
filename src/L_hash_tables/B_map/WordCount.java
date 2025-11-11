void main() throws FileNotFoundException {
    String filename = IO.readln("filename? ");
    Scanner fileScanner = new Scanner(new File(filename));
    Map<String, Integer> map = new HashMap<>();

    while (fileScanner.hasNext()) {
        String word = fileScanner.next();

        map.put(word, map.getOrDefault(word, 0) + 1);
        // equivalent to:
        // if (map.containsKey(word)) {
        //     map.put(word, map.get(word) + 1);
        // } else {
        //     map.put(word, 1);
        // }
    }

    for (String word : map.keySet()) {
        IO.println(word + ": " + map.get(word));
    }

    // or:
    // for (Map.Entry<String, Integer> entry : map.entrySet()) {
    //     System.out.println(entry.getKey() + ": " + entry.getValue());
    // }
}