 class Main {
    public static void main(String[] args) {
        String originalString = "hello";
        String replacementString = "world";

        String replacedString = replaceFirstChar(originalString, replacementString);

        System.out.println("Original String: " + originalString);
        System.out.println("Replacement String: " + replacementString);
        System.out.println("Replaced String: " + replacedString);
    }

    public static String replaceFirstChar(String originalStr, String replacementStr) {
        if (originalStr == null || originalStr.isEmpty() || replacementStr == null || replacementStr.isEmpty()) {
            return originalStr;
        }

        char firstChar = replacementStr.charAt(0);


        return firstChar + originalStr.substring(1);
    }
}




