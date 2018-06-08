package com.scheideggergroup.core.service;

import org.springframework.stereotype.Service;
import com.scheideggergroup.core.model.Coordinate;
import com.scheideggergroup.core.model.Route;
import com.scheideggergroup.core.model.Step;

/**
 * An interface of services used to calculate distance, directions and routes 
 * @author scheidv1
 *
 */
@Service("coordinateService")
public interface CoordinateService {

    /**
     * Calculates the distance between Coordinates.
     * @param startCoordinate the starting coordinate.
     * @param finalCoordinate the final coordinate.
     * @return the distance.
     */
    public double getDistanceBetweenCoordinates(Coordinate startCoordinate, Coordinate finalCoordinate);
    
    /**
     * Calculates the bearing between Coordinates.
     * @param startCoordinate the starting coordinate.
     * @param finalCoordinate the final coordinate.
     * @return the bearing.
     */
    public double getBearing(Coordinate startCoordinate, Coordinate finalCoordinate);
    
    /**
     * Calculates the final position after traveling a certain distance heading in a direction (bearing).
     * @param startCoordinate the starting coordinate.
     * @param bearing the bearing.
     * @param distance the distance.
     * @return the resulting coordinate.
     */
    public Coordinate getFinalPositionAfterMove(Coordinate startCoordinate, double bearing, double distance);
    
    /**
     * Calculates the info needed (distance and direction) for traveling from the start coordinate to the final coordinate.
     * @param startCoordinate the starting coordinate.
     * @param finalCoordinate the final coordinate.
     * @return the step object with travel info.
     */
    public Step calculateStep(Coordinate startCoordinate, Coordinate finalCoordinate);
    
    /**
     * Calculates all the info needed (distance and direction) of every step for traveling on a defined route.
     * @param route the route, containing a path.
     * @return the route with all steps calculated.
     */
    public Route calculateStepsOnRoute(Route route);
    
}
