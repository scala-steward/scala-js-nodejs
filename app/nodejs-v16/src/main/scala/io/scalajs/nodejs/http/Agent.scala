package io.scalajs.nodejs
package http

import com.thoughtworks.enableIf
import io.scalajs.nodejs.events.IEventEmitter

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

/** The HTTP Agent is used for pooling sockets used in HTTP client requests. The HTTP Agent also defaults client
  * requests to using Connection:keep-alive. If no pending HTTP requests are waiting on a socket to become free the
  * socket is closed. This means that Node.js's pool has the benefit of keep-alive when under load but still does not
  * require developers to manually close the HTTP clients using KeepAlive.
  */
@js.native
@JSImport("http", "Agent")
class Agent() extends IEventEmitter {
  def this(options: AgentOptions) = this()

  // ///////////////////////////////////////////////////////////////////////////////
  //      Properties
  // ///////////////////////////////////////////////////////////////////////////////

  /** An object which contains arrays of sockets currently awaiting use by the Agent when HTTP KeepAlive is used. Do not
    * modify.
    * @example
    *   agent.freeSockets
    */
  def freeSockets: js.Object = js.native

  /** By default set to 256. For Agents supporting HTTP KeepAlive, this sets the maximum number of sockets that will be
    * left open in the free state.
    * @example
    *   agent.maxFreeSockets
    */
  var maxFreeSockets: Int = js.native

  /** By default set to Infinity. Determines how many concurrent sockets the agent can have open per origin. Origin is
    * either a 'host:port' or 'host:port:localAddress' combination.
    * @example
    *   agent.maxSockets
    */
  var maxSockets: Int = js.native

  def maxTotalSockets: Double = js.native

  /** An object which contains queues of requests that have not yet been assigned to sockets. Do not modify.
    * @example
    *   agent.requests
    */
  def requests: js.Object = js.native

  /** An object which contains arrays of sockets currently in use by the Agent. Do not modify.
    * @example
    *   agent.sockets
    */
  // TODO what is the underlying object?
  def sockets: js.Object = js.native

  // ///////////////////////////////////////////////////////////////////////////////
  //      Methods
  // ///////////////////////////////////////////////////////////////////////////////

  /** Produces a socket/stream to be used for HTTP requests. By default, this function is the same as
    * net.createConnection(). However, custom Agents may override this method in case greater flexibility is desired.
    *
    * A socket/stream can be supplied in one of two ways: by returning the socket/stream from this function, or by
    * passing the socket/stream to callback.
    *
    * callback has a signature of (err, stream).
    * @example
    *   agent.createConnection(options[, callback])
    */
  def createConnection(options: ConnectionOptions, callback: js.Function): Unit = js.native

  def keepSocketAlive(socket: net.Socket): Unit = js.native

  def reuseSocket(socket: net.Socket, request: ClientRequest): Unit = js.native

  /** Destroy any sockets that are currently in use by the agent.
    *
    * It is usually not necessary to do this. However, if you are using an agent with KeepAlive enabled, then it is best
    * to explicitly shut down the agent when you know that it will no longer be used. Otherwise, sockets may hang open
    * for quite a long time before the server terminates them.
    * @example
    *   agent.destroy()
    */
  def destroy(): Unit = js.native

  def getName(options: GetNameOptions): String = js.native
}
