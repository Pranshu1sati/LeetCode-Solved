class ParkingSystem {
  int[] parkingSpaces;
    public ParkingSystem(int big, int medium, int small) {
        parkingSpaces = new int[3];
        parkingSpaces[0] = big;
        parkingSpaces[1] = medium;
        parkingSpaces[2] = small;
    }
    
    public boolean addCar(int carType) {
         if(parkingSpaces[carType - 1] == 0)
        {
            return false;
        }
        else
        {
            parkingSpaces[carType - 1]--;
            return true;
        }
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */