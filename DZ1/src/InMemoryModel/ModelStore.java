package InMemoryModel;

import java.util.ArrayList;

import ModelElements.Camera;
import ModelElements.Flash;
import ModelElements.PoligonalModel;
import ModelElements.Scene;

public class ModelStore implements IModelChanger, IModelChangedObserver {

    public ArrayList<PoligonalModel> models = new ArrayList<>();
    public ArrayList<Scene> scenes = new ArrayList<>();
    public ArrayList<Flash> flashes = new ArrayList<>();
    public ArrayList<Camera> cameras = new ArrayList<>();
    private ArrayList<IModelChangedObserver> changedObservers = new ArrayList<>();

    public Scene getScene(int idScene) {
        return scenes.get(idScene);
    }

    @Override
    public void NotifyChange(IModelChanger sender) {
        // ...

    }

    @Override
    public void ApplyUpdateModel() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ApplyUpdateModel'");
    }

}
