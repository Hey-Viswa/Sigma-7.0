// amazon wala problem


public class RemoveDuplicate {
    public static void main(String[] args) {
        String str = "apnapna";
        RemoveDuplicate(str, 0, new StringBuilder(), new boolean[26]);
    }
    public static void RemoveDuplicate(String str, int idx, StringBuilder sb, boolean[] map) {
        if (idx == str.length()) {
            System.out.println(sb);
            return;
        }

        char currChar = str.charAt(idx);
        if (map[currChar - 'a']) {
            RemoveDuplicate(str, idx + 1, sb, map);
        } else {
            map[currChar - 'a'] = true;
            RemoveDuplicate(str, idx + 1, sb.append(currChar), map);
        }
    }
    }

