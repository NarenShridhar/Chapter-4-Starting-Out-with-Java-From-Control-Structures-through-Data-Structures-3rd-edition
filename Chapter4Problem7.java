import java.util.Scanner;

public class Chapter4Problem7
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		int numberOfFloors;
		int userNumberOfFloors;
		int roomsOnFloor;
		int occupiedRoomsOnFloor;
		int vacantRoomsOnFloor;
		int totalOccupiedRooms = 0;;
		int totalVacantRooms = 0;;
		int totalNumberOfRooms = 0;
		double occupancyRate;

		System.out.println("How many floors in the hotel: ");
		userNumberOfFloors = keyboard.nextInt();

		if(userNumberOfFloors < 1)
		{
			System.out.println("Invalid amount of floors selected. Hotel must be atleast 1 floor.");
		}

		else if(userNumberOfFloors >= 1)
		{
			for (numberOfFloors = 1; numberOfFloors <= userNumberOfFloors; numberOfFloors++)
				{
					System.out.println("How many rooms on floor: " + numberOfFloors + "?");
					roomsOnFloor = keyboard.nextInt();

					if (roomsOnFloor < 10)
					{
						System.out.println("Invalid entry. Number of rooms on a floor must be atleast 10.");
					}

					else if (roomsOnFloor >= 10)
					{
						System.out.println("How many rooms on floor: " + numberOfFloors + " are occupied?");
						occupiedRoomsOnFloor = keyboard.nextInt();
						vacantRoomsOnFloor = roomsOnFloor - occupiedRoomsOnFloor;
						totalOccupiedRooms = totalOccupiedRooms + occupiedRoomsOnFloor;
						totalNumberOfRooms = totalNumberOfRooms + roomsOnFloor;
						totalVacantRooms = totalVacantRooms + vacantRoomsOnFloor;
					}

				}
			
		}

		occupancyRate = ( ( double )totalOccupiedRooms / totalNumberOfRooms ) * 100;

		System.out.println("The number of rooms in the hotel is: " + totalNumberOfRooms);
		System.out.println("The number of occupied rooms is: " + totalOccupiedRooms);
		System.out.println("The number of vacant rooms is: " + totalVacantRooms);
		System.out.println("The occupancy rate is: " + occupancyRate);
		
	}
}