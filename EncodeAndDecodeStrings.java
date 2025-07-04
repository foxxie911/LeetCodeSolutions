class Solution {

    public String encode(List<String> strs) {
        var result = "";
        for(String s: strs)
        {
            result += s.length() + "@" + s;
        }
        return result;
    }

    public List<String> decode(String str) {
        var result = new LinkedList<String>();
        int firstPoint = 0;
        while(firstPoint < str.length()){
            int lastPoint = firstPoint;
            while(str.charAt(lastPoint) != '@'){
                lastPoint++;
            }
            int wrdLength = Integer.parseInt(str.substring(firstPoint, lastPoint));
            firstPoint = lastPoint + 1;
            lastPoint = firstPoint + wrdLength;
            result.addLast(str.substring(firstPoint, lastPoint));
            firstPoint = lastPoint;
        }
        return result;
    }
}