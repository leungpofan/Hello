
public class Hello {

    public static int[] findTwoSum(int[] list, int sum) {
        for(int i = 0; i < list.length - 1; i++) {
        	for (int j = 0; j < list.length; j++) {
        		if (list[i] + list[j] == sum) {
        			int[] find = new int[] {i, j};
        			return find;
        		}
        	}
        }
        return null;
    }

    public static void main(String[] args) {
        int[] indices = findTwoSum(new int[] { 1, 3, 5, 7, 9 }, 12);
        System.out.println(indices[0] + " " + indices[1]);
    }

}
