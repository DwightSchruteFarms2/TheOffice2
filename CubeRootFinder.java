public class CubeRootFinder {
    public static void main(String[] args) {
        int target = 42;
        findCubeRoots(target);
    }

    public static void findCubeRoots(int target) {
        int cubeRoot = (int) Math.round(Math.pow(target, 1.0 / 3));

        for (int i = -cubeRoot; i <= cubeRoot; i++) {
            for (int j = -cubeRoot; j <= cubeRoot; j++) {
                for (int k = -cubeRoot; k <= cubeRoot; k++) {
                    if (i * i * i + j * j * j + k * k * k == target) {
                        System.out.printf("The three numbers whose cube is %d are: %d, %d, and %d%n", target, i, j, k);
                        return;
                    }
                }
            }
        }

        System.out.printf("No three numbers found whose cube is %d%n", target);
    }
}
