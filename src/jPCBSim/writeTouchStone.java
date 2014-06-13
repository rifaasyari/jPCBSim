// Copyright (c) 2014, tvelliott
// All rights reserved.
//
// Redistribution and use in source and binary forms, with or without
// modification, are permitted provided that the following conditions are met:
//
// * Redistributions of source code must retain the above copyright notice, this
//   list of conditions and the following disclaimer.
//
// * Redistributions in binary form must reproduce the above copyright notice,
//   this list of conditions and the following disclaimer in the documentation
//   and/or other materials provided with the distribution.
//
// * Neither the name of the {organization} nor the names of its
//   contributors may be used to endorse or promote products derived from
//   this software without specific prior written permission.
//
// THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
// AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
// IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
// DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
// FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
// DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
// SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
// CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
// OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
// OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.

package jPCBSim;

import java.io.*;

public class writeTouchStone
{

  private Simulation sim;

  public writeTouchStone(Simulation sim)
  {
    this.sim = sim;
  }

  public void write2p(double[] freq_mhz, double[][] data)
  {
    try {
      File file = new File(sim.sim_path+"/"+sim.sim_name+"/"+sim.sim_name+".s2p");
      PrintWriter pw = new PrintWriter(file);

      pw.println("! jPCBSim: Simulation Results For " +sim.sim_path+"/"+sim.sim_name+" Project.");
      pw.println("! Warning: S12 and S22 are actually just S21 and S11.  This is only true if your device is port-to-port symetrical!");
      pw.println("! Frequency       S11                S21                S12                S22");
      pw.println("# MHz  S  RI R  50");

      for(int i=0; i<freq_mhz.length; i++) {
        pw.println( String.format("%3.3f   %3.3f   %3.3f   %3.3f   %3.3f   %3.3f   %3.3f   %3.3f   %3.3f", new Double(freq_mhz[i]).doubleValue(),
                                  data[3][i], data[4][i],
                                  data[5][i], data[6][i],
                                  data[5][i], data[6][i],
                                  data[3][i], data[4][i]) );
      }

      pw.close();
    } catch(Exception e) {
    }
  }

  public void write1p(double[] freq_mhz, double[][] data)
  {
    try {
      File file = new File(sim.sim_path+"/"+sim.sim_name+"/"+sim.sim_name+".s1p");
      PrintWriter pw = new PrintWriter(file);

      pw.println("! jPCBSim: Simulation Results For " +sim.sim_path+"/"+sim.sim_name+" Project.");
      pw.println("! Frequency       S11");
      pw.println("# MHz  S  RI R  50");

      for(int i=0; i<freq_mhz.length; i++) {
        pw.println( String.format("%3.3f   %3.3f   %3.3f", new Double(freq_mhz[i]).doubleValue(), data[3][i], data[4][i]) );
      }

      pw.close();
    } catch(Exception e) {
    }
  }

}
