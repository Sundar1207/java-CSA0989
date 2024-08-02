import java.util.*;
class TrafficSignalOptimization 
{

    private static class IntersectionData 
    {
        int vehicleCount, averageSpeed, queueLength, pedestrianCount;

        IntersectionData(int vehicleCount, int averageSpeed, int queueLength, int pedestrianCount) 
        {
            this.vehicleCount = vehicleCount;
            this.averageSpeed = averageSpeed;
            this.queueLength = queueLength;
            this.pedestrianCount = pedestrianCount;
        }
    }

    private static class TrafficSignalController 
    {
        String intersectionId;
        int greenLightDuration;
        int redLightDuration;
        int pedestrianSignalDuration;

        TrafficSignalController(String intersectionId) 
        {
            this.intersectionId = intersectionId;
            this.greenLightDuration = 30;
            this.redLightDuration = 30;  
            this.pedestrianSignalDuration = 10;
        }

        void updateTimings(int greenDuration, int redDuration, int pedestrianDuration) 
        {
            this.greenLightDuration = greenDuration;
            this.redLightDuration = redDuration;
            this.pedestrianSignalDuration = pedestrianDuration;
            System.out.println("Updated timings for intersection " + intersectionId + ":");
            System.out.println("Green Light Duration: " + greenLightDuration + " seconds");
            System.out.println("Red Light Duration: " + redLightDuration + " seconds");
            System.out.println("Pedestrian Signal Duration: " + pedestrianSignalDuration + " seconds");
        }
    }
    public static void main(String args[])
    {
        Map<String, IntersectionData> 
        intersections = new HashMap<>();
        intersections.put("Intersection1",
        new IntersectionData(50, 45, 10, 20));
        intersections.put("Intersection2", 
        new IntersectionData(30, 35, 5, 10));
        Map<String, TrafficSignalController> controllers = new HashMap<>();

        for (String id : intersections.keySet()) 
        {
            controllers.put(id, new TrafficSignalController(id));
        }
        for (Map.Entry<String, IntersectionData> entry : intersections.entrySet()) 
        {
            String intersectionId = entry.getKey();
            IntersectionData data = entry.getValue();
            TrafficSignalController controller = controllers.get(intersectionId);

            int greenDuration = 30;
            int redDuration = 30;
            int pedestrianDuration = 10;
            if (data.vehicleCount > 40) 
            {
                greenDuration = 60;
                redDuration = 20;
            }

            if (data.pedestrianCount > 15) 
            {
                pedestrianDuration = 30;
            }
            controller.updateTimings(greenDuration, redDuration, pedestrianDuration);
        }
        Scanner sc=new Scanner(System.in);
        System.out.println("Adjust signal timings:");
        System.out.print("Enter intersection ID: ");
        String intersectionId = sc.nextLine();
        System.out.print("Enter new green light duration (seconds): ");
        int newGreenDuration = sc.nextInt();
        System.out.print("Enter new red light duration (seconds): ");
        int newRedDuration = sc.nextInt();
        System.out.print("Enter new pedestrian signal duration (seconds): ");
        int newPedestrianDuration = sc.nextInt();

        TrafficSignalController userController = controllers.get(intersectionId);
        if (userController != null) 
        {
            userController.updateTimings(newGreenDuration, newRedDuration, newPedestrianDuration);
        } 
        else 
        {
            System.out.println("Intersection ID not found.");
        }

        sc.close();
    }
}
