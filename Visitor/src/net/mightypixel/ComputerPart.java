package net.mightypixel;

public interface ComputerPart {
   public void accept(ComputerPartVisitor computerPartVisitor);
}