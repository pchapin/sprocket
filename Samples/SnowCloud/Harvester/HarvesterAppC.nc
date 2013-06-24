/**
 *  
 */

#include "StorageVolumes.h"
#include "KappaMsg.h"

#define NEW_PRINTF_SEMANTICS

configuration HarvesterAppC {

} implementation {
  components PrintfC, SerialStartC;    // Required for new Printf semantics.
  components HarvesterC as App, MainC;
  App.Boot -> MainC;

  components UserButtonC;
  App.ButtonPoll -> UserButtonC.Get;
  App.ButtonEvent -> UserButtonC.Notify;

  components CollectionC;
  App.DataReceive -> CollectionC.Receive[KAPPA_MSG_ID];
  App.RootControl -> CollectionC;
  App.CollectionControl -> CollectionC;
  App.CtpInfo -> CollectionC;

  components DisseminationC;
  App.DisseminationControl -> DisseminationC.StdControl;
  
  components new DisseminatorC(command_t, DIS_KEY) as SyncChan;
  App.Command -> SyncChan.DisseminationUpdate;
  
  // components new DisseminatorC(command_t, BCAST_DIS_KEY) as BcastChan;
  // App.Bcast -> BcastChan.DisseminationUpdate;
  components SpDisseminatorC as BcastChan, RPCControlC;
  App.Bcast -> BcastChan.SpDisseminationUpdate;
  App.BcastValue -> BcastChan.SpDisseminationValue;
  activate "*" for BcastChan.NeighborUpdate -> [BcastChan].SpDisseminationUpdate;
  App.SpartanBoot -> RPCControlC;
  App.RPCControl -> RPCControlC;
  
  components ActiveMessageC;
  App.RadioControl -> ActiveMessageC;
  
  components LedsC;
  App.Leds -> LedsC;

  components new TimerMilliC() as StopwatchTimer;
  App.Stopwatch -> StopwatchTimer;

  components new TimerMilliC() as PulseTimer;
  App.Pulse -> PulseTimer;

  components new TimerMilliC() as NonceTimer;
  App.NonceTimer -> NonceTimer;
}
