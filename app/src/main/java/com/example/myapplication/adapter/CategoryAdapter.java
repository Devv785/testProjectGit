package com.example.myapplication.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.model.Category;

import org.w3c.dom.Text;

import java.util.List;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder> {


    //страница на которую все будет выведено
    Context context;
    //список всех категорий, которые будут выведены
    List<Category> categories;

    public CategoryAdapter(Context context, List<Category> categories) {
        this.context = context;
        this.categories = categories;
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Использование нашего дизайна
        View categoryItems = LayoutInflater.from(context).inflate(R.layout.category_item, parent, false);
        //будет описан через CategoryViewHolder
        return new CategoryViewHolder(categoryItems);

    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder holder, int position) {
        //что конкретно в каждое поле подставляем(установка текста)
        holder.categoryTitle.setText(categories.get(position).getTitle());

    }

    @Override
    public int getItemCount() {
        return categories.size();
    }


    // вложенный класс, нужен для обращения к дизайну и выбора текста
    public static final class CategoryViewHolder extends RecyclerView.ViewHolder {

        TextView categoryTitle;

        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);
            //ссылка на нужный объект
            categoryTitle = itemView.findViewById(R.id.categoryTitle);
        }
    }

}
