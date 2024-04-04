package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.example.myapplication.adapter.CategoryAdapter;
import com.example.myapplication.adapter.CourseAdapter;
import com.example.myapplication.model.Category;
import com.example.myapplication.model.Course;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView categoryRecycle, courseRecycler, courseRecycler2, courseRecycler3;
    CategoryAdapter categoryAdapter;
    CourseAdapter courseAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Category> categoryList = new ArrayList<>();
        categoryList.add(new Category(1,"Тюльпаны"));
        categoryList.add(new Category(2,"Пионы"));
        categoryList.add(new Category(3,"Розы"));

        setCategoryRecycler(categoryList);


        List<Course> courseList = new ArrayList<>();
        courseList.add(new Course(1,"jelt", "Букет из \nжёлтых тюльпанов", "6990Р"));
        courseList.add(new Course(2,"red", "Букет из \nкрасных тюльпанов", "5990Р"));
        courseList.add(new Course(3,"rozov", "Букет из \nрозовых тюльпанов", "5590Р"));
        courseList.add(new Course(3,"white", "Букет из \nбелых тюльпанов", "4590Р"));

        setCourseRecycler(courseList);

        List<Course> courseList2 = new ArrayList<>();
        courseList2.add(new Course(1,"pion_rozov", "Букет из \nмалиновых пионов", "8990Р"));
        courseList2.add(new Course(2,"pion_white", "Букет из \nрозовых пионов", "4990Р"));


        List<Course> courseList3 = new ArrayList<>();
        courseList3.add(new Course(1,"roza_white", "Букет из \nбелых роз", "4090"));
        courseList3.add(new Course(2,"roza_red", "Букет из \nкрасных роз", "2999"));
        courseList3.add(new Course(2,"roza_pink", "Букет из \nрозовых роз", "5390"));

        setCourseRecycler(courseList);
        setCourseRecycler2(courseList2);
        setCourseRecycler3(courseList3);

    }

    private void setCourseRecycler3(List<Course> courseList3) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);

        courseRecycler3=findViewById(R.id.courseRecycler3);
        courseRecycler3.setLayoutManager(layoutManager);

        courseAdapter = new CourseAdapter(this, courseList3);
        courseRecycler3.setAdapter(courseAdapter);

    }

    private void setCourseRecycler2(List<Course> courseList2) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);

        courseRecycler2=findViewById(R.id.courseRecycler2);
        courseRecycler2.setLayoutManager(layoutManager);

        courseAdapter = new CourseAdapter(this, courseList2);
        courseRecycler2.setAdapter(courseAdapter);


    }

    private void setCourseRecycler(List<Course> courseList) {

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);

        courseRecycler=findViewById(R.id.courseRecycler);
        courseRecycler.setLayoutManager(layoutManager);

        courseAdapter = new CourseAdapter(this, courseList);
        courseRecycler.setAdapter(courseAdapter);


    }

    private void setCategoryRecycler(List<Category> categoryList) {

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);

        categoryRecycle=findViewById(R.id.categoryRecycle);
        categoryRecycle.setLayoutManager(layoutManager);

        categoryAdapter = new CategoryAdapter(this, categoryList);
        categoryRecycle.setAdapter(categoryAdapter);
    }

    public void buy(View view) {

    }
}