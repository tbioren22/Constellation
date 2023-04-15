# Constellation Extra Credit Project
<br/><br/><br/>

## How to Use:
There is an included Constellation.json file in the source code (the provided file makes the Big Dipper). Modify the file to create any constellation that you like.

**The JSON file is formatted as follows:**
{ID, X, Y, SIZE, COLOR, CONNECTIONS}
Each JSON object is a unique star.
- ID: The unike int identifier for each star
- X: The star's x-coordinate
- Y: The star's y-coordinate
- SIZE: The star's size
- COLOR: The star's color
- CONNECTIONS: An int[] that stores the IDs of the stars that this star is connected to.
<br/>

**Note**: A line **will** be drawn between 2 stars even if the stars aren't mutually
connected. (i.e. if star 1 is in star 2's connections but star 2 isn't in star 1's)
