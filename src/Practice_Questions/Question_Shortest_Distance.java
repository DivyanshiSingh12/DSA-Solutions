package Practice_Questions;
public class Question_Shortest_Distance {

    public static int shortestDistance(int arr[],int point1, int point2){

        int N = arr.length;

        // Step 1: Calculate total distance around the circle
        int totalDistance = 0;
        for (int i = 0; i < N; i++) {
            totalDistance += arr[i];
        }

        // Step 2: Find the distance between the two specified points
        int distanceBetweenPoints = 0;
        int index1 = -1;
        int index2 = -1;
        for (int i = 0; i < N; i++) {
            if (arr[i] == point1) {
                index1 = i;
                if (index2 != -1) {
                    break;
                }
            }
            if (arr[i] == point2) {
                index2 = i;
                if (index1 != -1) {
                    break;
                }
            }
        }

        

        // Step 3: Calculate shortest distance
        int shortestDistance = Math.abs(index2 - index1);
        shortestDistance = Math.min(shortestDistance, N - shortestDistance);
        return shortestDistance;

    }

    public static void main(String args[]){
        int[] arr = {1, 2, 3, 4};
        int point1 = 1;
        int point2 = 3;
        int result = shortestDistance(arr, point1, point2);
        System.out.println(result);
    }
    
}
