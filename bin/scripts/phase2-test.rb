#!/usr/bin/ruby

# Compiles Sprocket generated programs with the nesC compiler. This script must be run inside a
# Cygwin window (on Windows systems). This script also assumes the current directory is the
# Sprocket project directory.

class Attempt
  attr_reader :folder, :options, :hack
  def initialize(folder, options, hack)
    @folder  = folder
    @options = options
    @hack    = hack
  end
end

# The test cases.
attempts = [Attempt.new("Samples/Benchmarks/Duties/client",   "", false),
            Attempt.new("Samples/Benchmarks/Duties/server",   "", true ),
            Attempt.new("Samples/Benchmarks/Security/client", "", false),
            Attempt.new("Samples/Benchmarks/Security/server", "", true ),
            Attempt.new("Samples/BlinkR/provider",            "", true ),
            Attempt.new("Samples/BlinkR/user",                "", false),
            Attempt.new("Samples/BlinkToRadio",               "", false),
            Attempt.new("Samples/Diffusion",                  "", true )]

attempts.each { |attempt|
  if !Dir.exists?(attempt.folder + "/Sprocket-Out")
    puts("WARNING: " + attempt.folder + "/Sprocket-Out does not exist")
  else
    # TODO: Be sure the Sprocket-Out folder exists.
    Dir.chdir(attempt.folder + "/Sprocket-Out") do
      puts("+" * attempt.folder.length)
      puts(attempt.folder)
      puts("+" * attempt.folder.length)
      gets
      if attempt.hack
        system("cp ../AppC.gen AppC.nc")
      end
      system("make tmote " + attempt.options)
      puts("\n")
    end
  end
}
