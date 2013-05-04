#!/usr/bin/ruby

# Exercises Sprocket on various test and sample programs. This script assumes  sprocket.bat is
# available on the PATH. This script also assumes the current directory is the Sprocket project
# directory.

class Attempt
  attr_reader :folder, :options
  def initialize(folder, options)
    @folder  = folder
    @options = options
  end
end

# The test cases.
attempts = [Attempt.new("Samples/Benchmarks/Duties/client",   ""),
            Attempt.new("Samples/Benchmarks/Duties/server",   ""),
            Attempt.new("Samples/Benchmarks/Security/client", "\"-n=B\""),
            Attempt.new("Samples/Benchmarks/Security/server", "\"-n=A\""),
            Attempt.new("Samples/BlinkR/provider",            "\"-n=A\""),
            Attempt.new("Samples/BlinkR/user",                "\"-n=B\""),
            Attempt.new("Samples/BlinkToRadio",               ""),
            Attempt.new("Samples/Diffusion",                  "\"-n=A\"")]

attempts.each { |attempt|
  Dir.chdir(attempt.folder) do
    puts("+" * attempt.folder.length)
    puts(attempt.folder)
    puts("+" * attempt.folder.length)
    gets
    system("sprocket " + attempt.options)
    puts("\n")
  end
}
