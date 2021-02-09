package kmitl.esd.exercise1.composite;

public class CompositePattern {
	/**
	 * A main function for showing that the implementation works
	 *
	 * @return void
	 */
	public static void main(String[] args) {
		Department finance = new Department("Department1 (FINANCE)", 50);
		Department asset = new Department("Department1 (ASSET)", 60);

		finance.add(asset);

		Team assetTeam = new Team("asset1", 20);
		asset.add(assetTeam);

		finance.showDetails();
	}
}
