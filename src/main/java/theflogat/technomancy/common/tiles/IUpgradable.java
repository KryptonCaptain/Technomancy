package theflogat.technomancy.common.tiles;

public interface IUpgradable {
	public boolean toggleBoost();
	public boolean getBoost();
	public void setBoost(boolean newBoost);
}