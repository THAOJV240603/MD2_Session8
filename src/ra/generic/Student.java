package ra.generic;

import java.util.List;

public class Student implements IPerson<Student>{

    @Override
    public List<Student> getAll() {
        return List.of();
    }

    @Override
    public boolean create(Student student) {
        return false;
    }
}
