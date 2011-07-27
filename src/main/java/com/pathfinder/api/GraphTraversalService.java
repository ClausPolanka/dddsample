package com.pathfinder.api;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import java.util.Properties;

/**
 * Part of the external graph traversal API exposed by the routing team
 * and used by us (booking and tracking team).
 *
 */
public interface GraphTraversalService extends Remote {

  /**
   * @param originUnLocode origin UN Locode
   * @param destinationUnLocode destination UN Locode
   * @param limitations restrictions on the path selection, as key-value according to some API specification
   * @return A list of transit paths
   * @throws RemoteException RMI problem
   */
  List<TransitPath> findShortestPath(String originUnLocode,
                                     String destinationUnLocode,
                                     Properties limitations) throws RemoteException;

}
